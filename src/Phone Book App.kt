fun main() {

    val contact = mutableMapOf<String,Int>()

    Label@ while (true){
        println("Choose 1-> Add , 2 -> Search , 3 -> Delete , 4 -> Show , 5 -> Exit")
        val x = readln().toInt()

        when(x){
            1->{
                print("Enter name : ")
                val n = readln()
                print("Enter num : ")
                val num = readln().toInt()

                contact [n] = num
            }

            2->{
                print("Choose option for search 1->name , 2-> number : ")
                val o = readln().toInt()

                if (o == 1){
                    print("Enter name : ")
                    val na = readln()
                    if (na in contact) {
                        val matchingValue = contact.entries.find { it.key == na }
                        println("His number is : $matchingValue" )

                        /* or
                        val matchingValue = contact[na]
                         println("His number is : $matchingValue")
                           */
                    }
                    else{
                        println("not Found")
                    }
                }

                else if (o == 2){
                    print("Enter number : ")
                    val nu = readln().toInt()
                    if (nu in contact.values){
                        val matchingKey = contact.entries.find { it.value == nu }//?.key
                        println("His name is : $matchingKey")
                    }
                    else{
                        println("not Found")
                    }
                }
            }

            3->{
                print("Enter name to delete: ")
                val name = readln()

                if (contact.remove(name) != null) {
                    println("Contact deleted.")
                }

                else {
                    println("Contact not found.")
                }
            }

            4->{
                if (contact.isEmpty()) {
                    println("Contact list is empty.")
                }

                else {
                    println("All contacts:")
                    contact.forEach { (name, number) ->
                        println("Name: '$name' | Number: '$number'")
                    }
                }
            }

            5->{
                print("Thanks!")
                break@Label
            }

            else->{
                print("Wrong")
            }
        }
    }
}