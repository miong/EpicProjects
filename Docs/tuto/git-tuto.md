# Procedure de partage avec GIT / GERRIT

- Pour voir les modifications et cr�er sont commit : git gui

- Pour mettre de cot� les modification non commit�s (si besoin) : git stash

- Pour recupere l'�tat distant du serveur git : git fetch

- Pour appliquer l'�tat distant a votre machine local : git rebase -i
Faire echape puis ":wq" et enfin entrer pour conserver votre commit

Si des conflits sont r�v�l�s faire : git mergetool
Regler tous les conflits indiqu�es. Une fois cela fait vous pouver faire : git rebase --continue
puis tester vos modifications apr�s merge.

EN CAS DE DOUTES OU DE PROBLEMES => faire : git rebase --abort et appeler un ami pouvant vous aider

- Pour partager votre commit et ouvrir sa relecture faire : git review

- Pour r�cuperer les modifications misent de cot� (si il y en a) : git stash pop
