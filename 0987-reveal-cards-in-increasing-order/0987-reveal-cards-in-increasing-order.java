class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        if(n <= 2){
            return deck;
        }
        int last_element = 0;
        int curr_index = n - 3;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i: deck) {
            result.add(i);
        }
        while(curr_index >= 0) {
            last_element = result.get(n - 1);
            result.remove(n - 1);
            result.add(curr_index + 1, last_element);
            curr_index -= 1;
        }
        for(int i = 0; i < n; i++){
            deck[i] = result.get(i);
        }
        return deck;
    }
}