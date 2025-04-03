public class ProxyClothingImage implements ClothingImage {
    private String filename;
    private RealClothingImage realImage;

    public ProxyClothingImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealClothingImage(filename);
        }
        realImage.display();
    }
} 