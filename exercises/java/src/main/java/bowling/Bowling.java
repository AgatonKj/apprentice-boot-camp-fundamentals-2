package bowling;

//public class Bowling {
//    public int game(int[] rolls) {
//        int score = 0;
//        for (int  i = 0; i < rolls.length; i+=2 ){
//            int frame = 0;
//            if(rolls[i] == 10){
//              frame += rolls[i];
//              frame += rolls[i+1];
//              frame += rolls[i+2];
//              i-=1;
//            } else if (rolls [i]+rolls[i+1] == 10) {
//                frame += rolls[i];
//                frame += rolls[i+1];
//                frame += rolls[i+2];
//            } else {
//                frame += rolls[i];
//                frame += rolls[i+1];
//            }
//            score += frame;
//        }
//        return score;
//    }
//}

public class Bowling {
    public int game(int[] rolls) {
        int score = 0;
        for (int  i = 0; i < rolls.length; i++ ){
            int frame = 0;
            frame += rolls[i];
            frame += rolls[i+1];
            if(rolls[i] == 10){  //STRIKE
                frame += rolls[i+2];
            } else if (rolls [i]+rolls[i+1] == 10) { //SPARE
                frame += rolls[i+2];
                i++;
            } else {
            i++;
            }
            score += frame;
        }
        return score;
    }
}