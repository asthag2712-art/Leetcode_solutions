class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            int val=1;
            List<Integer> row=new ArrayList<>();
            row.add(val);
            for(int j=1;j<i;j++){
                
                val=val*(i-j);
                val=val/(j);
                row.add(val);
            }
            pascal.add(row);
        }

        return pascal;
        
        
    }
}