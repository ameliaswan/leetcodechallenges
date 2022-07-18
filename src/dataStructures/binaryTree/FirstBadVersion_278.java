package dataStructures.binaryTree;

public class FirstBadVersion_278 {
    public int[] versions;

    public int firstBadVersion(int n) {
        int begin = 1, end = n, mid = begin + (end - begin) / 2;
        int idx = Integer.MAX_VALUE;
        while(begin <= end){
            if(isBadVersion(mid)){
                idx = (mid < idx ? mid : idx);
                end = mid - 1;
            }else{
                begin = mid + 1;
            }

            // mid = (begin + end) / 2;
            mid = begin + (end - begin) / 2;
        }


        return idx;
    }

    boolean isBadVersion(int v){
        if(versions[v - 1] == 0){
            return true;
        }
        return false;
    }
}
