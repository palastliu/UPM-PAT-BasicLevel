package PATYiJi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class pat10252 {
    public static void main(String[] args) throws IOException{
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] str = input.readLine().trim().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++) arr[i] = Integer.parseInt(str[i]);	//把第一行数据转换成int
        int firstAddress = arr[0];
        int n = arr[1];
        int k = arr[2];
        
        Node25[] list = new Node25[100000];
        for (int i = 0; i < n; i++) {
        	str = input.readLine().trim().split(" ");		//把数据读取出来成为int
			Node25 temp = new Node25(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
            list[temp.address] = temp;						//把数据存入
        }
        input.close();
        List<Node25> array = new ArrayList<>();
        link(list, firstAddress, array);
        reverse(array, k);
        for (int i = 0; i < array.size() - 1; i++) {
            System.out.printf("%05d %d %05d\n", array.get(i).address,
                    array.get(i).data, array.get(i + 1).address);
        }
        int end = array.size() - 1;
        System.out.printf("%05d %d -1", array.get(end).address,
                array.get(end).data);
    }
    public static void reverse(List<Node25> array, int k) {
        for (int i = 0; i + k <= array.size(); i += k) {
            for (int m = i + k - 1, n = i; m >= n; m--, n++) {
            	Node25 temp = array.get(n);
                array.set(n, array.get(m));
                array.set(m, temp);
            }
        }
    }
    public static void link(Node25[] list, int firstAddress, List<Node25> array) {
        while (firstAddress != -1) {
            array.add(list[firstAddress]);
            firstAddress = list[firstAddress].next;
        }
    }
}
class Node25 {
    int address;
    int data;
    int next;
    Node25(int address, int data, int next) {
        this.address = address;
        this.data = data;
        this.next = next;
    }
}