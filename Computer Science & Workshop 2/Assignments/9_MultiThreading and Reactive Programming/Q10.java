//Q10. Write a Java program that processes a batch of images concurrently using multiple threads.
//Eachthreadshould apply a specific image processing operation (e.g., resizing, filtering) to its
//assigned image. Useathreadpool to manage the execution of image processing tasks. Ensure that
//each image is processed onlyoncebyasingle thread to avoid duplication or conflicts.

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ImageProcessor {
    private static final int NUM_THREADS = 4;

    public static void main(String[] args) {
        List<String> imagePaths = new ArrayList<>();
        imagePaths.add("image1.jpg");
        imagePaths.add("image2.jpg");
        imagePaths.add("image3.jpg");
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        for (String imagePath : imagePaths) {
            executor.submit(new ImageProcessingTask(imagePath));
        }
        executor.shutdown();
    }

    static class ImageProcessingTask implements Runnable {
        private final String imagePath;

        ImageProcessingTask(String imagePath) {
            this.imagePath = imagePath;
        }

        public void run() {
            processImage(imagePath);
        }

        private void processImage(String imagePath) {
            System.out.println("Processing image: " + imagePath);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Image processing completed: " + imagePath);
        }
    }
}
// Output:- Processing image: image1.jpg
// Processing image: image2.jpg
// Processing image: image3.jpg
// Image processing completed: image1.jpg
// Image processing completed: image2.jpg
// Image processing completed: image3.jpg