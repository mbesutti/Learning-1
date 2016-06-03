expressions=("Dario" "Stefano" "Valentino" "Vacca" "Gennaro")
RANDOM=$(( ( RANDOM % 10 )  + 1 ))

echo
echo "Premere INVIO per scegliere il presentatore di oggi"
echo

read -s -n 1 key

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
