Git and Github guide 
1. Creating a Repository:
   i. Log in to GitHub and click New.
   ii. Enter a repository name and set it to Public or Private.
   iii. Click Create repository
   Git command:
   git init

2. Cloning a Repository:
   i. Navigate to the repository you want to clone on GitHub.
   ii.Click on the Code button and copy the repository URL.
   iii.Open your terminal and run the following command:
    git clone <repository-url>

3. Creating Branches:
   Git command:
   git branch <branch-name>

4. Committing Changes:
   i.Make changes to your files.
   ii.Add the changes to the staging area using the command below.
   iii.Commit the changes with a descriptive message.
    Git command:
   git add .
   git commit -m "Your descriptive commit message"

5. Reverting Commits:
    Git command:
   git revert <commit-hash>

6. Pulling and Pushing Changes (Downstream and Upstream):
   i.Pull changes: To get changes from the remote repository to your local repository.
   ii.Push changes: To send your local changes to the remote repository.
    Git command:
   git pull origin <branch-name>
   git push origin <branch-name>

7. Fetching Changes:
    Git command:
   git fetch

8. Merging Branches:
   i. Switch to the branch you want to merge into.
   ii.Use the merge command to integrate changes.
    Git command:
   git checkout <target-branch>
   git merge <source-branch>

9. Renaming Branches:
    Git command:
   git branch -m <new-branch-name>

10. Creating Pull Requests:
    i.Push your branch to the remote repository.
    ii.On GitHub, go to the repository and click on New pull request.
    iii.Select the branch you want to merge from and the branch you want to merge into.

11. Reviewing and Merging Pull Requests:
    i. Open the pull request on GitHub.
    ii.Review the code changes.
    iii.Click the Merge pull request button if everything is correct.

12. Reverting Pull Requests:
    i.To revert a pull request, navigate to the merged pull request on GitHub.
    ii.Click on the Revert button.
    iii.Follow the prompts to create a new pull request that undoes the changes.
