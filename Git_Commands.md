
# GIT COMMANDS

## 1. Git Configuration
git config --global user.name "Your Name"
git config --global user.email "your@email.com"

## 2. Repository Commands
git init
git clone <repository-url>

## 3. Basic Commands
git status
git add filename
git add .
git commit -m "message"

## 4. Branch Commands
git branch
git branch branch-name
git checkout branch-name
git switch branch-name

## 5. Merge Commands
git merge branch-name
git merge --no-ff branch-name

## 6. Remote Commands
git remote -v
git remote add origin <url>
git push origin main
git pull origin main
git fetch origin

## 7. Git Tag Commands
git tag
git tag v1.0
git push origin v1.0
git push origin --tags

## 8. Log Commands
git log
git log --oneline

## 9. Undo Commands
git reset
git revert commit-id
git restore filename
