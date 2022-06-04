class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int[] sort = {};
        for(int cnt = 0; cnt < 3; cnt++){
            int i = commands[cnt][0];
            int j = commands[cnt][1];
            int k = commands[cnt][2];
            String[] str = new String[3];
            for(int a = i-1; a < j; a++){
                 str[cnt] = array[a]+"";
            }
        }

        return answer;
    }

}