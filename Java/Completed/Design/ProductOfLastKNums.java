package Completed.Design;

import java.util.ArrayList;
import java.util.List;

//Submission: https://leetcode.com/submissions/detail/944705925/

class ProductOfLastKNums {
    List<Integer> list;
    int prefixProduct;

    public ProductOfLastKNums() {
        list = new ArrayList<>();
        prefixProduct = 1;
    }

    public void add(int num) {
        if (num == 0) {
            list = new ArrayList<>();
            prefixProduct = 1;
        } else {
            prefixProduct *= num;
            list.add(prefixProduct);
        }
    }

    public int getProduct(int k) {
        int n = list.size();

        if (k == n)
            return prefixProduct;
        else if (k > n)
            return 0;
        else
            return prefixProduct / list.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */