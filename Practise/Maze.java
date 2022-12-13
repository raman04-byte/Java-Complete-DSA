package Practise;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(maze(3,3));
        // path("", 3, 3);
        boolean[][] arr = { 
            { true, true, true }, 
            { true, true, true }, 
            { true, true, true }
        };
        // pathRestriction("", arr, 0, 0);
        // allPath("", arr, 0, 0);
        int[][] path=new int[arr.length][arr[0].length];
        allPathPrint("", arr, 0, 0,path,1);
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

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPath(p + 'U', maze, r, c - 1);
        }
        maze[r][c] = true;

    }
    static void allPathPrint(String p, boolean[][] maze, int r, int c,int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;
            for(int[]arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c]=step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r + 1, c,path,step+1);
        }
        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1,path,step+1);
        }
        if (r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c,path,step+1);
        }
        if (c > 0) {
            allPathPrint(p + 'U', maze, r, c - 1,path,step+1);
        }
        maze[r][c] = true;
        path[r][c]=0;
    }
}
