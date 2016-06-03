expressions=("Dario" "Stefano" "Valentino" "Vacca" "Gennaro")
RANDOM=$(( ( RANDOM % 10 )  + 1 ))

echo
echo "Premere INVIO per scegliere il presentatore di oggi, premere + per aggiungere, - per rimuovere"
echo "I candidati presentatori sono al momento:"
echo
echo "${expressions[@]}"
echo

read -s -n 1 key

case $key in
	"")
#if [[ $key = "" ]]; then
	while [[ $key = "" ]]
	do
		if [[ $key = "" ]]; then 
			selectedexpression=${expressions[$RANDOM % ${#expressions[@]} ]}
			echo "*****  "$selectedexpression"  *****"
			echo
			echo "Premere INVIO per scegliere un altro presentatore, altrimenti premi un altro tasto"
			read -s -n 1 key
			echo
		fi
	done
	;
	"+")

#else 

	echo "Inserisci un nuovo possibile presentatore:"
	read  key
	expressions+=("$key")
	echo "I candidati presentatori sono al momento:"
	echo
	echo "${expressions[@]}"
	echo	
	;

	"-")
	echo "meno"	
	;	
	*)
	exit
esac
#fi
