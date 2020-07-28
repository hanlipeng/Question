package com.test.list;

/**
 * @author hanlipeng
 * @date 2020/7/24
 */
public class Sorter {

    public int[] sort(int[] a) {
        sortPart(a, 0, a.length - 1);
        return a;
    }

    public void sortPart(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = a[left];
        int lIdx = left + 1;
        int rIdx = right;
        while (lIdx <= rIdx) {
            while (a[lIdx] < mid && lIdx <= rIdx) lIdx++;
            while (a[rIdx] > mid && lIdx <= rIdx) rIdx--;
            if (lIdx < rIdx) {
                switchNum(a, lIdx, rIdx);
            }
        }
        switchNum(a, left, rIdx);
        sortPart(a, left, rIdx-1);
        sortPart(a, rIdx + 1, right);
    }

    private void switchNum(int[] a, int lIdx, int rIdx) {
        int tmp = a[lIdx];
        a[lIdx] = a[rIdx];
        a[rIdx] = tmp;
    }

}
