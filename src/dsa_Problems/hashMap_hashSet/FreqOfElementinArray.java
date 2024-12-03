package dsa_Problems.hashMap_hashSet;

public class FreqOfQinA {
    
    public int[] solve(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        int[] ans = new int[m];

        if(A.length == 0){
            return ans;
        }

        //Traverse through the give array and map the frequence of it in Hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            //Increase the ferequency of the element if present 
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i])+1);
            }else{
                hm.put(A[i], 1);
            }
        }

        for(int i = 0; i < m; i++){
            ans[i] = hm.getOrDefault(B[i], 0);
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
