public class SimpleDotCom {

    private int[] locationCells;
    private int numOfHits;

    String checkYourself(String guess) {
        int step = Integer.parseInt(guess);
        String response = "мимо";
        for (int locationCell : locationCells) {
            if (locationCell == step) {
                numOfHits++;
                locationCells[locationCell] = 0;
                response = "попал";
                break;
            }
        }if (numOfHits == 3) {
            response = "потопил";
        }
        return response;
    }

    void setLocationCells(int[] loc) {
        this.locationCells = loc;
    }
}
