package image;

public class RealImage implements Image{
    private String file;

    public RealImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        System.out.println(file + " was displayed");
    }
}
