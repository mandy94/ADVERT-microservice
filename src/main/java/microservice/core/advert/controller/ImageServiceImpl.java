package microservice.core.advert.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import microservice.core.advert.model.Image;
import microservice.core.advert.repository.ImageRepository;
@Service
public class ImageServiceImpl implements ImageService {
	@Autowired
	private ImageRepository imgrepo;
	
		@Override
		public byte[] decompressBytes(byte[] data) {
			Inflater inflater = new Inflater();
			inflater.setInput(data);
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
			byte[] buffer = new byte[1024];
			try {
				while (!inflater.finished()) {
					int count = inflater.inflate(buffer);
					outputStream.write(buffer, 0, count);
				}
				outputStream.close();
			} catch (IOException ioe) {
			} catch (DataFormatException e) {
			}
			return outputStream.toByteArray();
		}

		@Override
		// compress the image bytes before storing it in the database
				public byte[] compressBytes(byte[] data) {
					Deflater deflater = new Deflater();
					deflater.setInput(data);
					deflater.finish();

					ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
					byte[] buffer = new byte[1024];
					while (!deflater.finished()) {
						int count = deflater.deflate(buffer);
						outputStream.write(buffer, 0, count);
					}
					try {
						outputStream.close();
					} catch (IOException e) {
					}
					System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

					return outputStream.toByteArray();
				}

		@Override
		public void upload(MultipartFile file) {
			Image img = null;
			try {
				img = new Image(file.getOriginalFilename(), file.getContentType(),
						compressBytes(file.getBytes()));
				imgrepo.save(img);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		@Override
		public Image getImage(String imageName) {
			final Image retrievedImage = imgrepo.findByName(imageName);
			if(retrievedImage==null) return null;
			Image img = new Image(retrievedImage.getName(), retrievedImage.getType(),
					decompressBytes(retrievedImage.getPicByte()));
					System.out.println("IMage goet:" + img.getPicByte());
			return img;
		}

		@Override
		public Image getImageById(Long id) {
			final Image retrievedImage = imgrepo.findById(id).orElse(null);
			if(retrievedImage == null) return null;
			Image img = new Image(retrievedImage.getName(), retrievedImage.getType(),
					decompressBytes(retrievedImage.getPicByte()));
					System.out.println("IMage goet:" + img.getPicByte());
			return img;
			}

		@Override
		public boolean hasSameName(String imageName) {
			final Image retrievedImage = imgrepo.findByName(imageName);
			if(retrievedImage != null)
				return true;
			else
				return false;
			
		}

		@Override
		public String renameNext(String imageName) {
			final List<Image> retrievedImage = imgrepo.findByNameContaining(imageName);
			return imageName + "(" + retrievedImage.size()+ ")";
		}


}
