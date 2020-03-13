# Commit Change

## `git commit --amend`

This command changes last commit

```shell
$ git commit --amend
$ git push -f
```

Following command changes last commit more easily.

```shell
$ git commit --amend -m "message"
$ git push -f
```

## `git rebase -i HEAD~3`

This command changes multiple commits from HEAD. (In this case, 3)

```shell
$ git rebase -i HEAD~3

# Change 'pick' to 'edit'
...
pick 0df3242 1
eidt 32dfs0e 2
pick 0342gd3 3
...

# Enter '!wq' to save

$ git commit --amend
$ git rebase --continue

Successfully rebased and updated

$ git push -f
```

