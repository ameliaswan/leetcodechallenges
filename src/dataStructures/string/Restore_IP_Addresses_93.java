package dataStructures.string;

import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses_93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> ipList = new ArrayList<>();
        List<String> ip = new ArrayList<>();
        helper(0, s, ip, ipList);

        return ipList;
    }

    public void helper(int pivot, String s, List<String> ip, List<String> ipList){
        //fail condition
            //if the s is "" || substring is not long enough for constructing the rest ip || longer if ip has already been constructed
        if(s.length() == 0 || 4-ip.size() > s.substring(pivot).length() || (4-ip.size())*3 < s.substring(pivot).length()){
            return;
        }
        //success condition
        if(ip.size() == 4 && pivot == s.length()){
            ipList.add(String.join(".", ip));
            return;
        }
        //recursive method
        for(int i = 1; i <=3 && pivot+i <= s.length(); i++){
            String sub = s.substring(pivot, pivot+i);
            if(sub.equals("0") || (!sub.startsWith("0") && Integer.parseInt(sub)<=255)){
                ip.add(sub);
                helper(pivot+i, s, ip, ipList);
                ip.remove(ip.size()-1);
            }
        }
    }
}
