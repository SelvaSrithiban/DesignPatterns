package facade.withFacade;

public class ImageEditingManager {

    private ImageEditingProcessor imageEditingProcessor;

    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageEditingProcessor = new ImageEditingProcessor(imageLoader, filterService, imageModifier, imageWriter, analyticsService);
    }

    public void editImage(String imagePath, String filterType, int brightness) {
        imageEditingProcessor.processImageByEdit(imagePath, filterType, brightness);
       
    }

}