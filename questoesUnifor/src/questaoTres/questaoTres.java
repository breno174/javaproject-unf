package questaoTres;

import java.awt.Color;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class questaoTres {
    public static int AMOUNT;

    public static void main(String[] args) {
        String filepath = "questoesUnifor\\src\\questaoTres\\praia-tropical_74190-188.jpg";
        File file = new File(filepath);

        Scanner sc = new Scanner(System.in);
        System.out.print("Aumente ou Diminua o Brilho da Imagem: ");
        AMOUNT = sc.nextInt();

        sc.close();

        try {
            BufferedImage image = ImageIO.read(file);
            int width = image.getWidth();
            int height = image.getHeight();

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    Color c = new Color(image.getRGB(i, j));

                    int newRed = (c.getRed() + AMOUNT) <= 255 ? c.getRed() + AMOUNT >= 0 ? (c.getRed() + AMOUNT) : 0
                            : 255;
                    int newGreen = (c.getGreen() + AMOUNT) <= 255
                            ? c.getGreen() + AMOUNT >= 0 ? (c.getGreen() + AMOUNT) : 0
                            : 255;
                    int newBlue = (c.getBlue() + AMOUNT) <= 255 ? c.getBlue() + AMOUNT >= 0 ? (c.getBlue() + AMOUNT) : 0
                            : 255;

                    image.setRGB(i, j, new Color(newRed, newGreen, newBlue).getRGB());

                }
            }
            ImageIO.write(image, "jpg", file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
