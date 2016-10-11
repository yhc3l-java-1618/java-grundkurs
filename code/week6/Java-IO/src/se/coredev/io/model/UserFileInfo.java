package se.coredev.io.model;

import java.io.File;

import se.coredev.io.storage.file.FileInfo;

public final class UserFileInfo implements FileInfo<User> {

	private final String directoryName;
	private final String collectionFileName;
	private final String fileExtension;
	
	public UserFileInfo(String directoryName, String collectionFileName, String fileExtension) {
		this.directoryName = directoryName;
		this.collectionFileName = collectionFileName;
		this.fileExtension = fileExtension;
	}

	@Override
	public String getSingleFileName(User value) {
		return value.getId() + value.getUsername();
	}

	@Override
	public String getCollectionFileName() {
		return collectionFileName;
	}

	@Override
	public String getFileExtension() {
		return fileExtension;
	}

	@Override
	public File getDirectory() {
		return new File(directoryName);
	}

}
