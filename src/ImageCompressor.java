import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ImageCompressor {
	public static byte[] compressRGB24ToRGB16(int width, int height, byte[] rgb24) {
		
		return null;
	}

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.texpix");
			byte[] w = { (byte) fis.read(), (byte) fis.read(), (byte) fis.read(), (byte) fis.read() };
			byte[] h = { (byte) fis.read(), (byte) fis.read(), (byte) fis.read(), (byte) fis.read() };
			int width = ByteBuffer.wrap(w).order(ByteOrder.LITTLE_ENDIAN).getInt();
			int height = ByteBuffer.wrap(h).order(ByteOrder.LITTLE_ENDIAN).getInt();
			byte[] data = new byte[width * height * 3];
			for (int i = 0; i < data.length; i++) {
				data[i] = (byte) fis.read();
			}
			PixelViewer.displayImageRGB24(width, height, data);

			//1. Complete the compressRGB24ToRGB16 method.
			
			//2. Use PixelViewer.displayImageRGB16(imageWidth, imageHeight, compressedDataByteArray);
			//   to test your method. The image should look almost identical to the uncompressed image.
			
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
