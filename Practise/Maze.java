package Practise;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(maze(3,3));
        // path("", 3, 3);
        boolean[][] arr = { {true,true,true}, {true,false,true}, {true,true,true} 
    };
    pathRestriction("", arr, 0, 0);
    }

    static int maze(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int center = maze(r - 1, c - 1);
        int left = maze(r - 1, c);
        int right = maze(r, c - 1);
        return left + right + center;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
        }
        if (r > 1 && c > 1)
            path(p + 'D', r - 1, c - 1);
        if (r > 1)
            path(p + 'B', r - 1, c);
        if (c > 1)
            path(p + 'R', r, c - 1);

    }

    static void pathRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestriction(p + 'B', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {

            pathRestriction(p + 'C', maze, r, c + 1);
        }
    }
}
