int numWaterBottles(int numBottles, int numExchange) {
    int total = numBottles;
    int empty = numBottles; 

    while(empty>=numExchange){
        int newbottles = empty/numExchange;
        total+=newbottles;
        empty = (empty%numExchange) + newbottles;
    }

    return total;
}