package ss8_Clean_Code_and_Refactoring.Bai_tap;

public class test1 {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {

        int tempScore = 0;
        boolean draw = player1Score == player2Score;
        if (draw) return getDraw(player1Score);
        boolean winner = player1Score >= 4 || player2Score >= 4;
        if (winner)return getWinner(player1Score, player2Score);
        String score = getPoint(player1Score) + "-" + getPoint(player2Score);
        return score;
    }

    private static String getPoint(int tempScore) {
        switch(tempScore)
        {
            case 0:
                return"Love";
            case 1:
                return"Fifteen";
            case 2:
                return"Thirty";
            case 3:
                return"Forty";

        }
        return getPoint(tempScore);
    }

    private static String getWinner(int m_score1, int m_score2) {
        int minusResult = m_score1 - m_score2;
        if (minusResult==1) return "Advantage player1";
        else if (minusResult ==-1) return "Advantage player2";
        else if (minusResult>=2) return  "Win for player1";
        else return "Win for player2";
    }

    private static String getDraw(int m_score1) {
        switch (m_score1)
        {
            case 0:
                return "Love-All";

            case 1:
                return"Fifteen-All";

            case 2:
                return "Thirty-All";

            case 3:
                return "Forty-All";

            default:
                return "Deuce";
        }
    }
}
