package microservice.core.advert.controller;

import org.springframework.web.multipart.MultipartFile;

import microservice.core.advert.model.Image;

public interface ImageService {
	public byte[] compressBytes(byte[] data);
	public byte[] decompressBytes(byte[] data);
	public void upload(MultipartFile file);
	public Image getImage(String name);
	public Image getImageById(Long id);
	public boolean hasSameName(String imageName);
	public String renameNext(String imageName);
}
