import java.util.Scanner;

public class ImageDriver {
	public static void main(String[] args) {

			String filename = "cow.gif";
			Picture picture = new Picture(filename);
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter how much lighter you want to make the picture between 0 and 1:");
			double bright = scan.nextDouble();
			System.out.println("Enter how much darker you want to make the picture between 0 and 1:");
			double dark = scan.nextDouble();
			System.out.println("Enter how much you want to scroll through the picture:");
			int offset = scan.nextInt();
			System.out.println("Enter an integer to enlarge the image by:");
			int factor = scan.nextInt();
			
			ImageManipulator image = new ImageManipulator(filename);
			image.makeNegative();
			image.flipVertical();
			image.flipHorizontal();
			image.lighten(bright);
			image.darken(dark);
			image.scrollHorizontal(picture.getWidth() - offset);
			image.scrollVertical(picture.getHeight() - offset);
			image.makeGreyscale();
			image.rotate();
			image.swapCorners();
			image.blur();
			image.scaleLarger(factor);
			
			
			System.out.println("All images have been created, refresh the java project!");
      	
	}
}