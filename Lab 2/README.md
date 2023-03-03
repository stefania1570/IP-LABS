# Echipa: #

Constantinescu Stefania  
Dulhac Alexandru  
Bondor Laura  
Codau Silviu  

## Cerinta: P2P SHOPPING ##
Create a shopping assistant application. It should contain all the standard shopping list, planner, and sharing functionalities. The special functionality of this application will be its P2P Shopping functions. Since the application knows the shopping list and can track the GPS location of the user (also Wi-Fi RTT when applicable), we can remember where the user was when they marked a certain item as completed. This information can be saved and aggregated across multiple users to form a dynamic user-generated “map” of where products can be found in a supermarket.  
For example, if I have 4 items on my shopping list:  
 - Onions
 - Shampoo
 - Pasta
 - Chicken breast meat
When I pick up the pasta and mark it as completed in my Todo/Shopping list, the app remembers my GPS location for where I picked the item up (probably next to the pasta alley. This information is stored on the server and aggregated with other users. When a new user goes shopping and has “pasta” on their shopping list, the application will give them directions to reach the same location the pasta is located based on previous users' shared information.  

List of functionalities:  
 - Form dynamic maps of shopping locations based on GPS/WiFi data collected from many users
 - Remember item locations based on where users mark them as complete
 - Create optimal routes for shopping based on the dynamic map and shopping list of the user
 - Based on the shopping list and where different users have found various items, suggest which supermarket/shop/shopping center has all the items desired by the user
 - Basic shopping list functions, being able to share them, make recurrent items, save additional (optional) metadata such as prices, brand name, quantities, etc.
 - Shared shopping list functionality, multiple people being able to add and mark as complete items in a shopping list in real-time (Multi-Agent TSP)


