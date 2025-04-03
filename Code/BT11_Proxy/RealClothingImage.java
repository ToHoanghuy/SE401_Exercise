public class RealClothingImage implements ClothingImage {
    private String filename;
    private String imageData;

    public RealClothingImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image " + filename + " from disk...");
        // Giả lập việc tải ảnh từ ổ đĩa (trong thực tế sẽ tải file ảnh thật)
        imageData = "Image data for " + filename;
        System.out.println("Image loaded successfully");
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageData);
    }
} 