/*
Title: Next Greater Element (Monotonic Stack)

Problem:
Given an array of integers `nums`, for each element, find the next element
to its right that is strictly greater. If none exists, return -1 for that index.

Example:
  Input:  [2, 1, 2, 4, 3]
  Output: [4, 2, 4, -1, -1]

Time: O(n)
Space: O(n)
*/

#include <bits/stdc++.h>
using namespace std;

vector<int> nextGreaterElements(const vector<int>& nums) {
    int n = (int)nums.size();
    vector<int> res(n, -1);
    vector<int> st; // stack of indices

    for (int i = 0; i < n; ++i) {
        while (!st.empty() && nums[i] > nums[st.back()]) {
            int idx = st.back();
            st.pop_back();
            res[idx] = nums[i];
        }
        st.push_back(i);
    }
    return res;
}

int main() {
    vector<int> nums = {2, 1, 2, 4, 3};
    auto out = nextGreaterElements(nums);

    cout << "Input : ";
    for (int x : nums) cout << x << " ";
    cout << "\nOutput: ";
    for (int x : out) cout << x << " ";
    cout << "\n";

    // Additional tests
    vector<vector<int>> tests = {
        {1, 3, 2, 4},
        {6, 5, 4, 3},
        {1, 1, 1, 1}
    };
    for (auto& t : tests) {
        auto r = nextGreaterElements(t);
        for (int x : r) cout << x << " ";
        cout << "\n";
    }
    return 0;
}
