public class ImageManipulator {
	
	private String filename;
	private Picture image;

	public ImageManipulator(String name) {
		this.filename = name;
		image = new Picture(name);
	}
	
	public void makeNegative() {
		int width = image.getWidth();
		int height = image.getHeight();

		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
		
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				int pB = pix.getBlue();
				int pG = pix.getGreen();
				int pR = pix.getRed();

				int Red = 255 - pR;
				int Blue = 255 - pB;
				int Green = 255 - pG;
				
				Pixel k = new Pixel(Red, Blue, Green);
				image.setPixel(i, j, k);
			}
		}
		image.store("negative.gif");
	}
	
	public void flipVertical() {
		
		image = new Picture(filename);
		int width = image.getWidth();
		int height = image.getHeight();
		Picture photo = new Picture(width, height);

		for(int i = 0; i < width; i++) {	
			for(int j = 0;  j < height; j++) {
		
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				photo.setPixel(i,  height-1-j, pix);
			}
		}
		photo.store("flipped.gif");
	}
	
	public void flipHorizontal() {
		
		image = new Picture(filename);
		int width = image.getWidth();
		int height = image.getHeight();
		Picture photo = new Picture(width, height);

		for(int i = 0; i < width; i++) {	
			for(int j = 0;  j < height; j++) {
		
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				photo.setPixel(width-i-1, j, pix);
			}
		}
		photo.store("horizontalflip.gif");
	}
	
	public void lighten(double amount) {
		
		int width = image.getWidth();
		int height = image.getHeight();

		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
		
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				int pB = pix.getBlue();
				int pG = pix.getGreen();
				int pR = pix.getRed();

				int Red = (int) ((1-amount)*pR + amount*255);
				int Blue = (int) ((1-amount)*pB + amount*255);
				int Green = (int) ((1-amount)*pG + amount*255);
				
				Pixel k = new Pixel(Red, Blue, Green);
				image.setPixel(i, j, k);
				
			}
		}
		image.store("lighter.gif");
	}
	
	public void darken(double amount) {
		
		int width = image.getWidth();
		int height = image.getHeight();

		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
		
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				int pB = pix.getBlue();
				int pG = pix.getGreen();
				int pR = pix.getRed();

				int Red = (int) ((1-amount)*pR);
				int Blue = (int) ((1-amount)*pB);
				int Green = (int) ((1-amount)*pG);
				
				Pixel k = new Pixel(Red, Blue, Green);
				image.setPixel(i, j, k);
			}
		}
		image.store("darker.gif");
	}
	
	public void scrollHorizontal(int numpixels) {
		image = new Picture(filename);
		int width = image.getWidth();
		int height = image.getHeight();
		Picture photo = new Picture(width, height);
		
		for(int i = 0; i < width; i++) {	
			for(int j = 0;  j < height; j++) {
		
				int newpixels = i + numpixels;
				Pixel pix = new Pixel();		
				pix = image.getPixel(i, j);
				if(newpixels >= width) {
					newpixels = newpixels - width;
					photo.setPixel(newpixels, j, pix);
				}
				else {
					photo.setPixel(newpixels, j, pix);
				}
			}
		}
		photo.store("scrollhorizontal.gif");
	}
	
	public void scrollVertical(int numpixels) {
		image = new Picture(filename);
		int width = image.getWidth();
		int height = image.getHeight();
		Picture photo = new Picture(width, height);

		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				int newpixels = j + numpixels;
				if(newpixels >= height) {
					newpixels = newpixels - height;
					photo.setPixel(i, newpixels, pix);
				}
				else {
					photo.setPixel(i, newpixels, pix);
				}
			}
		}
		photo.store("scrollvertical.gif");
	}
	
	public void makeGreyscale() {
		
		int width = image.getWidth();
		int height = image.getHeight();

		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
		
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				
				int pR = pix.getRed();
				int pG = pix.getGreen();
				int pB = pix.getBlue();

				int Red = (int) ((.3 * pR) + (.59 * pG) + (.11 *pB));
				int Blue = (int) ((.3 * pR) + (.59 * pG) + (.11 *pB));
				int Green = (int) ((.3 * pR) + (.59 * pG) + (.11 *pB));
				
				Pixel k = new Pixel(Red, Blue, Green);
				image.setPixel(i, j, k);
			}
		}
		image.store("greyscale.gif");
	}
	
	public void swapCorners() {
		
		image = new Picture(filename);
		int width = image.getWidth();
		int height = image.getHeight();
		Picture photo = new Picture(width, height);
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				photo.setPixel((i + width / 2) % width, (j + height / 2) % height , pix);
			}
		}
		photo.store("cornerswap.gif");
	}
	
	public void blur() {
		
		image = new Picture(filename);
		int width = image.getWidth();
		int height = image.getHeight();
		Picture photo = new Picture(width, height);
		
		for(int i = 0; i < width; i++) {
			for(int j = 0;  j < height; j++) {
				
				int sum = 0;
				int Red = 0;
				int Green = 0;
				int Blue = 0;
				
				for(int x = -1; x < 2; x++) {
					for(int y = -1; y < 2; y++) {
						if(i + x >= 0 && i + x < width && j + y >= 0 && j + y < height) {
							Pixel pix= new Pixel();
							pix = image.getPixel(i + x, j + y);

							int pR = pix.getRed();
							int pG = pix.getGreen();
							int pB = pix.getBlue();

							Red = (pR + Red);
							Green = (pG +Green);
							Blue = (pB + Blue);

							sum++;
						}
					}
				}
				Pixel pix = new Pixel(Red / sum, Green / sum, Blue / sum);
				photo.setPixel(i, j, pix);
			}
		}
		photo.store("blur.gif");
	}

	public void rotate() {
		
		image = new Picture(filename);
		int width = image.getWidth();
		int height = image.getHeight();
		Picture photo = new Picture(height, width);

		for(int i = 0; i < width; i++) {	
			for(int j = 0;  j < height; j++) {
		
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				photo.setPixel(height-j-1, i, pix);
			}
		}
		photo.store("rotate.gif");
	}
	
	
	//EXTRA CREDIT - THE ONLY ONE I CAN FIGURE OUT
	public void scaleLarger(int factor) { //basically it just multiplies the number of pixels by the factor
		
		image = new Picture(filename);
		int width = image.getWidth();
		int height = image.getHeight();
		Picture photo = new Picture(width * factor, height * factor);
		
		for(int i = 0 ; i < width; i++) {
			for(int j = 0; j < height; j++) {
				Pixel pix = new Pixel();
				pix = image.getPixel(i, j);
				for(int x = 0; x < factor; x++){
					for(int y = 0; y < factor; y++){
						photo.setPixel(x + i * factor, y + j * factor, pix);
					}
				}
			}
		}
		photo.store("scaled.gif");
	}
}