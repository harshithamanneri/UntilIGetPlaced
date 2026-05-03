# 🤝 Contributing to Until I Get Placed

Thank you for your interest in contributing! 🚀
This repository is built to help everyone improve their **DSA skills** and prepare for placements.

---

## 📌 How You Can Contribute

You can contribute in multiple ways:

* 🧠 Add new DSA problems
* 💡 Improve existing solutions
* ⚡ Optimize code
* 📝 Add explanations or comments
* 🐛 Fix bugs or errors

---

## 🛠️ Contribution Steps

1. **Fork the repository**

2. **Clone your fork**

   ```bash
   git clone https://github.com/<your-username>/UntilIGetPlaced.git
   ```

3. **Create a new branch**

   ```bash
   git checkout -b feature/your-feature-name
   ```

4. **Make your changes**

5. **Commit your changes**

   ```bash
   git commit -m "Added: <problem name / improvement>"
   ```

6. **Push to your fork**

   ```bash
   git push origin feature/your-feature-name
   ```

7. **Open a Pull Request 🚀**

---

## 📂 Folder Structure

Please follow this structure while adding problems:

```
Arrays/
LinkedList/
Stacks/
Queues/
Trees/
Graphs/
DynamicProgramming/
```

---

## 📋 Guidelines

* ✔️ Write clean and readable code
* ✔️ Add comments to explain logic
* ✔️ Use meaningful file names
  Example: `two_sum.cpp`, `reverse_linked_list.java`
* ✔️ Mention the problem source (LeetCode, GFG, etc.)
* ✔️ Avoid duplicate problems

---

## 🧪 Code Example Format

```cpp
// Problem: Two Sum
// Platform: LeetCode
// Difficulty: Easy

#include <bits/stdc++.h>
using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> mp;
    for(int i = 0; i < nums.size(); i++) {
        int complement = target - nums[i];
        if(mp.count(complement)) {
            return {mp[complement], i};
        }
        mp[nums[i]] = i;
    }
    return {};
}
```

---

## 🚫 What Not to Do

* ❌ Don’t submit copied code without understanding
* ❌ Don’t create unnecessary files
* ❌ Don’t break the folder structure

---

## 🎯 Goal

This repository aims to:

* Help students prepare for coding interviews
* Build strong DSA fundamentals
* Encourage consistent practice

---

## ⭐ Final Note

Every contribution matters, whether big or small 💙

> *“The best way to learn is by building and sharing.”*

Happy Coding! 🚀
