#!/bin/bash

expressions=("DARIO" "STEFANO" "VALENTINO" "VACCA" "GENNARO" "ALE" "TIA" "MANLIO" "MASSI" "GABRI" "ENRI" "CHICCO" "PINO" "MATTEO" "FRANCO")
RANDOM=$(( ( RANDOM % 10 )  + 1 ))

function scegli {
	selectedexpression=${expressions[$RANDOM % ${#expressions[@]} ]}
	echo	
	echo "*****  "$selectedexpression"  *****"
	echo
}

function aggiungi {
	trovato=0
	echo "Inserisci un nuovo possibile presentatore:"
	read  key
	trim=${key//[[:blank:]]/}
	cerca $trim 
	if [[ "$trovato" -ne 1 ]]; then
		inserisci $trim
	else	
		echo
		echo "Esiste gia' un possibile presentatore col nome appena inserito"
		echo
	fi
		
}

function rimuovi {
	trovato=0
	echo "Rimuovi un presentatore:"
	read  key
	trim=${key//[[:blank:]]/}
	cerca $trim 
	if [[ "$trovato" -ne 1 ]]; then
		echo
		echo "!!!ATTENZIONE!!! Il presentatore che si e' cercato di rimuovere non esiste!"
		echo
	fi
	echo "I candidati presentatori sono al momento:"
	echo
	printf "* "'%s\n' "${expressions[@]}"
	echo	
}

function cerca(){
	token=$1
	for i in "${!expressions[@]}"; do
		if [[ "${expressions[$i]}" = "${token^^}" ]]; then
			expressions=(${expressions[@]:0:$i} ${expressions[@]:$(expr $i + 1)})
			trovato=1
		fi
	done
}


function inserisci(){
	expressions+=("${trim^^}")
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
