
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SecretMessageDecoder {

    static class Point {
        char ch;
        int x;
        int y;

        Point(char ch, int x, int y) {
            this.ch = ch;
            this.x = x;
            this.y = y;
        }
    }

    public static void printSecretMessage(String urlString) {
        try {
            URL url = new URL(urlString);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String line;
            List<Point> points = new ArrayList<>();

            int maxX = 0;
            int maxY = 0;

            while ((line = br.readLine()) != null) {

                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split("\\s+");

                if (parts.length < 3) {
                    continue;
                }

                try {
                    char ch = parts[0].charAt(0);
                    int x = Integer.parseInt(parts[1]);
                    int y = Integer.parseInt(parts[2]);

                    points.add(new Point(ch, x, y));

                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);

                } catch (Exception e) {
                  
                }
            }

            br.close();

            char[][] grid = new char[maxY + 1][maxX + 1];

            for (int i = 0; i <= maxY; i++) {
                for (int j = 0; j <= maxX; j++) {
                    grid[i][j] = ' ';
                }
            }

            for (Point p : points) {
                grid[p.y][p.x] = p.ch;
            }

            for (int i = 0; i <= maxY; i++) {
                System.out.println(new String(grid[i]));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        String googleDocUrl =
                "https://docs.google.com/document/d/e/2PACX-1vSvM5gDlNvt7npYHhp_XfsJvuntUhq184By5xO_pA4b_gCWeXb6dM6ZxwN8rE6S4ghUsCj2VKR21oEP/pub";

        printSecretMessage(googleDocUrl);
    }
}

