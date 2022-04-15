/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * step 1:   git init ---with create the working directory
 * stept 2:  git add .---- to add all the files in the staged area.
 *              git restore --staged filename  ----- to remove the file from the staged
 *             git add HelloWorld.java to add particular file.
 * step 3   git status  / git diff   to know the files in staged area read for commit.
 * step 4     git commit -m "first commit" to commit and give this commit a message.
 * step 5   git commit --amend   to alter the last commit message.
 * step 6   git log to get the history of the all previous commits.
 * step 7  git push origin master  ------ it will push the commit to the repository.
 * 
 * step 8:  git branch "branchName"   --- to crate a new branch name.
 * step9:    git checkout  branch//name    -------to switch to the branchName
 * step 10: git checkout master   -----go back to the master  
 * step 11:  git branch -d branchName     ---- to delete the branchName
 * step 12:  git checkout -b newBranch    ----- it will create the new branch and move to it.
 * step 13  git push origin newBranch     ------ it will pust the new branch.
 * step 14  git push origin --delete newBranch   ---will delete the new branch which has been already pushed.
 * step 15   git merge master it will merge all the changes done in the master into the new branch file.
 * step 16   git rebase master   -- it will make pull changes and rebase into the new branch file.
 * step 17   git pull    --- it will pull from the origin.
 * step 18    git pull upstream master    --- it will pull from the upstream  master branch.
 * step 19    git fetch  -----it will not change in file system we can compare the changes and add it.
 * 
 * 
 */
package helloworld;

/**
 *
 * @author marpar
 */
public class HelloWorld {

    /**
     * @param args the command line arguments and parms 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        String str="Par vaiz";
        System.out.println(str);
    }
    
}
