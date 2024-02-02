public class Queen {
    private int[] column = new int[8]; //ͬ���Ƿ��лʺ�1��ʾ��
    private int[] rup = new int[15]; //�����������Ƿ��лʺ�
    private int[] lup = new int[15]; //�����������Ƿ��лʺ�
    private int[] queen = new int[8]; //���
    private int num; //�����

    public static void main(String[] args) {
        Queen queen = new Queen();   
        queen.backtrack(0);
    }

    public void backtrack(int i) {
        if (i == 8) {
            showAnswer();
        } else {
            for (int j = 0; j < 8; j++) {
                if ((column[j] == 0) && (rup[i+j] == 0) && (lup[i-j+7] == 0)) {
                    //���޻ʺ�
                    queen[i] = j; //�趨Ϊռ��
                    column[j] = rup[i+j] = lup[i-j+7] = 1; 
                    backtrack(i+1);  //ѭ������
                    column[j] = rup[i+j] = lup[i-j+7] = 0;
                }
            } 
        }  
    }

    protected void showAnswer() {
        num++;
        System.out.println("\n���" + num);
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if(queen[y]==x) {
                    System.out.print("Q");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    
}