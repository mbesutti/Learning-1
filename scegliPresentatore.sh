#!/bin/bash

expressions=("DARIO" "STEFANO" "VALENTINO" "VACCA" "GENNARO")
RANDOM=$(( ( RANDOM % 10 )  + 1 ))

function scegli {
	selectedexpression=${expressions[$RANDOM % ${#expressions[@]} ]}
	echo	
	echo "*****  "$selectedexpression"  *****"
	echo
}

function aggiungi {
	echo "Inserisci un nuovo possibile presentatore:"
	read  key
	expressions+=("${key^^}")
	echo "I candidati presentatori sono al momento:"
	echo
	printf "* "'%s\n' "${expressions[@]}"
	echo	
}

function rimuovi {
	echo "Rimuovi un nuovo possibile presentatore:"
	read  key
	trim=${key//[[:blank:]]/}
	for i in "${!expressions[@]}"; do
		if [[ "${expressions[$i]}" = "${trim^^}" ]]; then
			expressions=(${expressions[@]:0:$i} ${expressions[@]:$(expr $i + 1)})
			trovato=1
		fi
	done
	if [[ "$trovato" -ne 1 ]]; then
		echo
		echo "!!!ATTENZIONE!!! Il presentatore che si è cercato di rimuovere non esiste!"
		echo
	fi
	echo "I candidati presentatori sono al momento:"
	echo
	printf "* "'%s\n' "${expressions[@]}"
	echo	
}

echo
echo "I candidati presentatori sono al momento:"
echo
printf "* "'%s\n' "${expressions[@]}"
echo
echo "Durante l'esecuzione dello script usa una delle seguenti opzioni:"
echo
echo "****************************************************"
echo "Premere INVIO per scegliere il presentatore di oggi"
echo "Premere + per aggiungere un presentatore"
echo "Premere - per rimuovere un presentatore"
echo "Premere q per terminare l'esecuzione"
echo "****************************************************"
echo

while [[ $key != "quit" ]]
	do
	read -s -n 1 key

	case $key in
		"")
		scegli
		;;
		"+")
		aggiungi
		;;
		"-")
		rimuovi
		;;
		"q")
		exit	
	esac
done
