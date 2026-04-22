class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();
    
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<dictionary.length; j++){

                int count=0;

                for(int idx=0; idx<queries[i].length(); idx++){
                    if(queries[i].charAt(idx)!=dictionary[j].charAt(idx)){
                        count++;
                    }

                    if (count>2){
                        break;
                    }
                }

                if (count<=2){
                    res.add(queries[i]);
                    break;
                }
            }    
        }

        return res;
    }
}
