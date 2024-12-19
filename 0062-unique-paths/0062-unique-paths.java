class Solution {
    public int uniquePaths(int m, int n) {
        int[][] seen = new int[m][n];
        Arrays.stream(seen).forEach(a->Arrays.fill(a, -1));
        int sol = recursion(m-1, n-1, seen);
        return sol;
    }
    public int recursion(int i, int j, int[][] seen){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }

        if(seen[i][j]!=-1) return seen[i][j];

        int up = recursion(i-1, j, seen);
        int left = recursion(i, j-1, seen);
        seen[i][j] = up+left;
        return seen[i][j];
    }
}