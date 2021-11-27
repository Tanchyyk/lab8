package image;

public class ProxyImage implements Image{
    private String file;
    private RealImage realImage;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(file);
            System.out.println(file + " converted to the Real Image.");
        }
    }
}
