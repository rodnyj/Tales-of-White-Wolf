package GUI;

/**
 * Created by Rodny & Colin on 3/29/2015.
 * version 1.0
 * Course ITEC 3860 Spring 2015
 *
 *The Purpose of this class is to be the User interface to the game
 *
 * This class calls the other classes to do things as needed
 */
import Puzzle.Puzzle;

import CharacterC.CharacterC;
import Monster.Monster;
import Item.Item;
import Room.Room;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.util.*;


public class Main extends Application
{

    //declare various objects
    String inputText;
    CharacterC character;
    Item dragonSword = new Item("dragonslayer","Weapon", 25);

    static ArrayList<Room> roomList = new ArrayList<Room>();

    static ArrayList<Monster> cityMonsterListMain =new ArrayList<Monster>();
    static ArrayList<Monster> forestMonsterListMain =new ArrayList<Monster>();
    static ArrayList<Monster> dungeonMonsterListMain =new ArrayList<Monster>();

    static Monster forestMonster4 = new Monster(75.0,false,0,"Giant Centipede", true, 7);

    static ArrayList<Item> itemListMain = new ArrayList<Item>();

    static ArrayList<Puzzle> puzzleListMain = new ArrayList<Puzzle>();

    static Map<String, Integer> room0Map = new HashMap<>() ;
    static Map<String, Integer> room1Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room2Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room3Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room4Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room5Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room6Map = new HashMap<String, Integer>();
    static Map<String, Integer> room7Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room8Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room9Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room10Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room11Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room12Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room13Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room14Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room15Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room16Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room17Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room18Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room19Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room20Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room21Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room22Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room23Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room24Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room25Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room26Map = new HashMap<String, Integer>();
    static Map<String, Integer> room27Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room28Map = new HashMap<String, Integer>() ;
    static Map<String, Integer> room29Map = new HashMap<String, Integer>();
    static Map<String, Integer> room30Map = new HashMap<String, Integer>();

    Random ran = new Random();



    @Override
    public void start(final Stage primaryStage) throws Exception
    {


        //declare the various areas of the gui

        //output area
        final TextArea outputTA = new TextArea();
        outputTA.setWrapText(true);
        outputTA.setEditable(false);
        outputTA.setPrefHeight(320.0);

        //enemy stat area
        final TextArea enemyTA = new TextArea();
        enemyTA.setEditable(false);
        enemyTA.setPromptText("Enemy Stats");


        //character inventory and stats
        final TextArea inventoryTA = new TextArea();
        inventoryTA.setWrapText(true);
        inventoryTA.setEditable(false);
        inventoryTA.setPromptText("Inventory");


        //input field
        final TextField inputTF = new TextField();
        inputTF.setPromptText("Type Here");

        //character name field(for saves)
        final TextField characterFileName = new TextField();
        characterFileName.setPrefColumnCount(25);
        characterFileName.setPromptText("Please type in your character's name.");

        //character password(for saving/loading purposes)
        final TextField characterFilePassword = new TextField();
        characterFilePassword.setPrefColumnCount(25);
        characterFilePassword.setPromptText("Please type in your character's password.");

        //button to make a new character
        final Button createCharacter = new Button("New Game");

        //button to load character
        final Button getCharacter = new Button("Load Game");

        //arrange the 2 GUIs
        //character creation GUI
        VBox characterLeft = new VBox(15);
        characterLeft.getChildren().addAll(characterFileName, createCharacter);
        characterLeft.setAlignment(Pos.CENTER_RIGHT);

        VBox characterRight = new VBox(15);
        characterRight.getChildren().addAll(characterFilePassword, getCharacter);
        characterRight.setAlignment(Pos.CENTER_LEFT);

        final HBox creationMenu = new HBox(15);
        creationMenu.getChildren().addAll(characterLeft, characterRight);
        creationMenu.setAlignment(Pos.BOTTOM_CENTER);
        creationMenu.setVisible(true);

        //game interaction GUI
        VBox inputOutputVB = new VBox(15);
        inputOutputVB.getChildren().addAll(inputTF, outputTA);

        VBox enemyInventoryVB = new VBox(15);
        enemyInventoryVB.getChildren().addAll(enemyTA, inventoryTA);

        final HBox gameScreen = new HBox(15);
        gameScreen.getChildren().addAll(inputOutputVB, enemyInventoryVB);
        gameScreen.setVisible(false);

        //stackpane to switch from character creation to game interaction GUIs
        StackPane primaryStackPane = new StackPane();
        primaryStackPane.getChildren().addAll(creationMenu, gameScreen);

        //general layout
        BorderPane primaryBorderPane = new BorderPane();
        primaryBorderPane.setCenter(primaryStackPane);
        primaryBorderPane.setPadding(new Insets(20,20,20,20));

        //set the scene
        Scene primaryScene = new Scene(primaryBorderPane);
        primaryScene.setFill(Paint.valueOf("grey"));

        //set GUI info and start the GUI
        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("Tales of White Wolf");
        primaryStage.show();

        //start eventhandlers
        inputTF.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                //allow for the player to press the enter key to send in their input
                if(keyEvent.getCode().equals(KeyCode.ENTER))
                {
                    //check to make sure the string is not null
                    if(inputTF.getLength() != 0)
                    {
                        //get the text from the input and add it to the output(as a record of what has been typed)
                        outputTA.appendText(inputTF.getText() + "\n");
                        inputText = inputTF.getText().trim();
                        inputTF.clear();

                        //take the input and compare it to a list of commands
                        if(inputText.split(" ")[0].equalsIgnoreCase("commands"))
                        {
                            System.out.println("commands typed");
                            outputTA.appendText("Commands: help   move   equip   search   take   drop   attack\n");
                            outputTA.appendText("save   exit(leaves game)   load   directions   menu\n");
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("refreshinv"))
                        {
                            inventoryTA.clear();
                            inventoryTA.appendText("Name: " + character.getCharacterName() + "\n");
                            inventoryTA.appendText("Health: " + character.getCharacterHealth() + "\n");
                            inventoryTA.appendText("Strength: " + character.getCharacterStrength() + "\n");

                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("/givegodsword"))
                        {
                            character.addItemToInventory(dragonSword);
                            System.out.println(character.getInventory().get("dragonslayer").getItemName() + ": " + character.getInventory().get("dragonslayer").getDamage() );
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("help"))
                        {
                            //get hints from puzzles and rooms
                            //outputTA.appendText(roomList.get(character.getCharacterLocation).getHelp());
                            System.out.println("help typed");
                            outputTA.appendText("This feature is not implemented yet.");
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("move"))
                        {
                            System.out.println("move typed");

                            //call movement methods
                            if(inputText.split(" ").length < 2)
                            {
                                outputTA.appendText("you didn't type a direction");

                            }
                            else if(roomList.get(character.getCharacterLocation()).getMonsterList().size()>0 &&
                                    (!roomList.get(character.getCharacterLocation()).getMonsterList().get(0).isMonsterDefeated() || roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getHealth()>0) )
                            {
                                outputTA.appendText("You must defeat the monster before you can leave.\n");
                            }
                            else if(roomList.get(character.getCharacterLocation()).getDirections().contains(
                                    inputText.split(" ")[1].toLowerCase()))
                            {

                                System.out.println("Moving to next room.");

                                character.setCharacterLocation(roomList.get(
                                        character.getCharacterLocation()).getRoomDirectionMap().get(inputText.split(" ")[1].toLowerCase()));

                                System.out.println("Location: " +character.getCharacterLocation());
                                enemyTA.clear();
                                inventoryTA.clear();

                                int spawn = Math.abs(ran.nextInt()%100);
                                System.out.println(spawn);

                                if( spawn >= roomList.get(character.getCharacterLocation()).getMonsterSpawnChance()
                                        && !roomList.get(character.getCharacterLocation()).isVisited())
                                {
                                    if(character.getCharacterLocation() == 18 && spawn >= 80)
                                    {
                                     roomList.get(character.getCharacterLocation()).getMonsterList().add(forestMonster4);
                                    }
                                    else if(roomList.get(character.getCharacterLocation()).getType().equalsIgnoreCase("city"))
                                    {
                                        roomList.get(character.getCharacterLocation()).addMonster(
                                                cityMonsterListMain.get(Math.abs(ran.nextInt()%cityMonsterListMain.size())));
                                    }
                                    else if(roomList.get(character.getCharacterLocation()).getType().equalsIgnoreCase("forest"))
                                    {
                                        roomList.get(character.getCharacterLocation()).addMonster(
                                                forestMonsterListMain.get(Math.abs(ran.nextInt()%forestMonsterListMain.size())));
                                    }
                                    else
                                    {
                                        roomList.get(character.getCharacterLocation()).addMonster(
                                                dungeonMonsterListMain.get(Math.abs(ran.nextInt()%dungeonMonsterListMain.size())));
                                    }
                                }

                                if(roomList.get(character.getCharacterLocation()).getMonsterList().size()>0)
                                {
                                    enemyTA.appendText("Name: " + roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getMonsterName() + "\n");
                                    enemyTA.appendText("Strength: " + roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getMonsterStrength() + "\n");
                                    enemyTA.appendText("Health: " + roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getHealth() + "\n");
                                }

                                if(character.getCharacterLocation() == 0)
                                {
                                    character.setCharacterHealth(100);
                                }

                                roomList.get(character.getCharacterLocation()).setVisited(true);
                                outputTA.appendText(roomList.get(character.getCharacterLocation()).getRoomDescription() + "\n");
                                inventoryTA.appendText("Name: " + character.getCharacterName() + "\n");
                                inventoryTA.appendText("Health: " + character.getCharacterHealth() + "\n");
                                inventoryTA.appendText("Strength: " + character.getCharacterStrength() + "\n");
                                inventoryTA.appendText("Equipped Item: " + character.getEquippedItem().getItemName() + "\n");
                            }
                            else
                            {
                                outputTA.appendText("There is no path leading that direction.\n");
                            }
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("attack"))
                        {
                            System.out.println("attack typed");
                            //get character attack and health and monster attack and health
                            //change the health values based on attack values

                            if(roomList.get(character.getCharacterLocation()).getMonsterList().size()>0)
                            {

                                if (roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getHealth() > 0)
                                {

                                        roomList.get(character.getCharacterLocation()).getMonsterList().get(0).setHealth(
                                                roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getHealth()
                                                        - Math.abs(ran.nextInt() % (character.getCharacterStrength() + character.getEquippedItem().getDamage())));

                                    if(roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getHealth() <= 0)
                                    {
                                        roomList.get(character.getCharacterLocation()).getMonsterList().get(0).setMonsterDefeated(true);
                                    }
                                    else
                                    {
                                        character.setCharacterHealth(character.getCharacterHealth() - (Math.abs(ran.nextInt()%
                                                roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getMonsterStrength())));
                                    }
                                }
                                else
                                {
                                    roomList.get(character.getCharacterLocation()).getMonsterList().get(0).setMonsterDefeated(true);
                                }
                                enemyTA.clear();
                                inventoryTA.clear();

                                enemyTA.appendText("Name: " + roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getMonsterName() + "\n");
                                enemyTA.appendText("Strength: " + roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getMonsterStrength() + "\n");
                                enemyTA.appendText("Health: " + roomList.get(character.getCharacterLocation()).getMonsterList().get(0).getHealth() + "\n");

                                inventoryTA.appendText("Name: " + character.getCharacterName() + "\n");
                                inventoryTA.appendText("Health: " + character.getCharacterHealth() + "\n");
                                inventoryTA.appendText("Strength: " + character.getCharacterStrength() + "\n");
                                inventoryTA.appendText("Equipped Item: " + character.getEquippedItem().getItemName() + "\n");

                            }

                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("/adminkill"))
                        {
                            roomList.get(character.getCharacterLocation()).getMonsterList().get(0).setMonsterDefeated(true);
                            roomList.get(character.getCharacterLocation()).getMonsterList().get(0).setHealth(0);
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("take"))
                        {

                            String itemName = "";
                            for(int i = 1; i < inputText.split(" ").length; i++)
                            {
                                itemName = itemName + " " + inputText.split(" ")[i];
                            }
                            itemName = itemName.substring(1);
                            System.out.println("take typed");
                            //check if item exists in the room
                            if(inputText.split(" ").length<2)
                            {


                                outputTA.appendText("You haven't selected anything to take.");

                            }

                            else if(roomList.get(character.getCharacterLocation()).getItemList().containsKey(itemName))
                            {
                                outputTA.appendText("You put " + itemName + " in your inventory.\n");
                                character.addItemToInventory(roomList.get(character.getCharacterLocation()).getItemList().get(itemName));
                                roomList.get(character.getCharacterLocation()).getItemList().remove(itemName);
                            }

                            else
                            {
                                System.out.println("Successful take to inventory.");
                                System.out.println("item not added to inventory.");
                                outputTA.appendText("That item is not in this room.\n");
                            }
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("directions"))
                        {
                            System.out.println("directions typed");
                            //get the directions of the current room
                            outputTA.appendText("The valid Directions are: " + roomList.get(character.getCharacterLocation()).getValidDirections() + "\n");
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("save"))
                        {
                            System.out.println("save typed");
                            //initiate save
                            outputTA.appendText("This feature is currently a WIP and is unavailable at this time.");
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("exit"))
                        {
                            System.out.println("exit typed");
                            if(inputText.split(" ").length<2)
                            {
                                outputTA.appendText("Are you sure you want to exit? Any unsaved progress will be lost.\n");
                                outputTA.appendText("To exit type \"exit yes\" to save and exit type \"exit save\"\n");
                            }

                            else if(inputText.split(" ")[1].equalsIgnoreCase("save"))
                            {
                                System.out.println("save and exit");
                                //initiate save

                                //exit game
                                primaryStage.close();
                            }

                            else if(inputText.split(" ")[1].equalsIgnoreCase("yes"))
                            {
                                System.out.println("exit confirmed");
                                //exit game
                                primaryStage.close();
                            }

                            else
                            {
                                System.out.println("exit gibberish");
                                outputTA.appendText("That wasn't an option for exit\n");
                            }
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("search"))
                        {
                            System.out.println("search typed");
                            outputTA.appendText("While we're glad that you're clever enough to search for the unknown,\n");
                            outputTA.appendText("this feature is not yet implemented.\n");
                        }

                        else if(inputText.split(" ")[0].equalsIgnoreCase("menu"))
                        {
                            System.out.println("menu typed");
                            if(inputText.split(" ").length<2)
                            {
                                outputTA.appendText("Warning any unsaved progress will be lost.\n");
                                outputTA.appendText("To return to menu type \"menu yes\" to continue with your current" +
                                        " game type a valid command\n");
                            }

                            else if(inputText.split(" ")[1].equalsIgnoreCase("yes"))
                            {
                                System.out.println("menu confirmed");

                                //switch to menu
                                gameScreen.setVisible(false);
                                creationMenu.setVisible(true);

                                //clear outputTA to prevent inter-game dialogue
                                outputTA.clear();

                            }


                            else
                            {
                                outputTA.appendText("That is not a valid menu command.\n");
                            }
                        }
                        else if(inputText.split(" ")[0].equalsIgnoreCase("equip"))
                        {

                            System.out.println("equip typed");

                            String itemName = "";
                            for(int i= 1 ; i<inputText.split(" ").length; i++)
                            {
                                itemName = itemName + " " +inputText.split(" ")[i];
                            }
                            itemName = itemName.substring(1);
                            System.out.println(itemName);

                            if(inputText.split(" ").length<2)
                            {
                                outputTA.appendText("type equip <item name>\n");
                            }
                            else if(character.getInventory().keySet().contains(itemName))
                            {
                                outputTA.appendText("You are now holding: " + itemName +".\n");
                                character.setEquippedItem(character.getInventory().get(itemName));
                                System.out.println(character.getEquippedItem().getItemName());
                            }
                        }
                        else
                        {
                            System.out.println("unknown typed");
                            //catch all for misspellings and invalid commands
                            outputTA.appendText("That is not a valid command. Type \"commands\" to find a list of commands\n");
                        }
                    }

                }
            }
        });

        createCharacter.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent ae)
            {
                //create character save data
                character = new CharacterC(characterFileName.getText());

                ArrayList<Room> roomList = new ArrayList<Room>();

                //give story info
                outputTA.appendText("Welcome, " + character.getCharacterName() + " to the wintry land of Wolvaria\n");
                outputTA.appendText("This land has long awaited the arrival of a true hero.\n");
                outputTA.appendText("The land has been pillaged by a dragon for the past three harvests.\n");
                outputTA.appendText("yatta yatta yatta... plot thickens... So will you save us hero?\n");
                outputTA.appendText("To begin your journey, move North out of this room and speak to the bartender.\n" +
                        " His name is \"Commands\".\n");
                outputTA.appendText("---------------------------------------------------------------\n");

                //switch to interaction GUI
                creationMenu.setVisible(false);
                gameScreen.setVisible(true);
            }
        });

        getCharacter.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                character = new CharacterC(characterFileName.getText());
                //retrieve data from file

                //switch to game screen
                creationMenu.setVisible(false);
                gameScreen.setVisible(true);

                outputTA.appendText("This feature is currently a WIP and is unavailable at this time.\n");
                outputTA.appendText("Type \"menu\" to return to character creation.\n");
            }
        });
    }




    public static void main(String[] args) {



        Monster cityMonster1 = new Monster(10.0,false,0,"Wild Dog",false, 4);
        Monster cityMonster2 = new Monster(10.0,false,0,"Bandit",false, 5);

        Monster forestMonster1 = new Monster(15.0,false,0,"Wolf", false, 5);
        Monster forestMonster2 = new Monster(15.0,false,0,"Bear", false, 6);
        Monster forestMonster3 = new Monster(20.0,false,0,"Giant Spider", false, 4);


        Monster dungeonMonster1 = new Monster(25.0,false,0,"Skeleton",false, 6);
        Monster dungeonMonster2 = new Monster(25.0,false,0,"Goblin",false,6);
        Monster dungeonMonster3 = new Monster(30.0,false,0,"Undead Witch", false,7);
        Monster dungeonMonster4 = new Monster(100.0,false,0,"Dragon", true, 11);

        Item dragonSword = new Item("Dragon Slayer","Weapon", 25);



        cityMonsterListMain.add(cityMonster1);
        cityMonsterListMain.add(cityMonster2);

        forestMonsterListMain.add(forestMonster1);
        forestMonsterListMain.add(forestMonster2);
        forestMonsterListMain.add(forestMonster3);

        dungeonMonsterListMain.add(dungeonMonster1);
        dungeonMonsterListMain.add(dungeonMonster2);
        dungeonMonsterListMain.add(dungeonMonster3);

        room0Map.put("north", 1);
        room0Map.put("n" , 1);

        room1Map.put("north", 2);
        room1Map.put("n", 2);

        room2Map.put("ne",3);
        room2Map.put("nw",7);
        room2Map.put("s", 1);
        room2Map.put("northeast",3);
        room2Map.put("northwest",7);
        room2Map.put("south", 1);

        room3Map.put("e", 4);
        room3Map.put("east", 4);
        room3Map.put("n", 5);
        room3Map.put("north", 5);
        room3Map.put("sw", 2);
        room3Map.put("southwest", 2);

        room4Map.put("w", 3);
        room4Map.put("west", 3);

        room5Map.put("s", 3);
        room5Map.put("south", 3);
        room5Map.put("e", 12);
        room5Map.put("east", 12);
        room5Map.put("w", 6);
        room5Map.put("west", 6);

        room6Map.put("s", 7);
        room6Map.put("south", 7);
        room6Map.put("w", 8);
        room6Map.put("west", 8);
        room6Map.put("e", 5);
        room6Map.put("east", 5);

        room7Map.put("north", 6);
        room7Map.put("n", 6);
        room7Map.put("southeast", 2);
        room7Map.put("se", 2);

        room8Map.put("east", 6);
        room8Map.put("e", 6);
        room8Map.put("ne", 10);
        room8Map.put("northeast", 10);
        room8Map.put("northwest", 9);
        room8Map.put("nw", 9);

        room9Map.put("se", 8);
        room9Map.put("southeast", 8);

        room10Map.put("n",11);
        room10Map.put("north",11);
        room10Map.put("sw",8);
        room10Map.put("southwest",8);

        room11Map.put("s", 10);
        room11Map.put("south", 10);

        room12Map.put("w", 5);
        room12Map.put("west", 5);
        room12Map.put("nw", 13);
        room12Map.put("northwest", 13);
        room12Map.put("northeast", 15);
        room12Map.put("ne", 15);

        room13Map.put("nw", 14);
        room13Map.put("northwest", 14);
        room13Map.put("se", 12);
        room13Map.put("southeast", 12);

        room14Map.put("se", 13);
        room14Map.put("southeast", 13);

        room15Map.put("sw", 12);
        room15Map.put("southwest", 12);
        room15Map.put("e", 16);
        room15Map.put("east", 16);
        room15Map.put("n", 17);
        room15Map.put("north", 17);

        room16Map.put("w", 15);
        room16Map.put("west", 15);

        room17Map.put("s", 15);
        room17Map.put("south", 15);
        room17Map.put("ne", 18);
        room17Map.put("northeast", 18);
        room17Map.put("nw", 19);
        room17Map.put("northwest", 19);

        room18Map.put("southwest", 17);
        room18Map.put("sw", 17);

        room19Map.put("se", 17);
        room19Map.put("southeast", 17);
        room19Map.put("nw", 20);
        room19Map.put("northwest", 20);
        room19Map.put("north", 22);
        room19Map.put("n", 22);

        room20Map.put("nw", 21);
        room20Map.put("northwest", 21);
        room20Map.put("se", 19);
        room20Map.put("southeast", 19);

        room21Map.put("se", 20);
        room21Map.put("southeast", 20);
        room21Map.put("nw", 26);
        room21Map.put("northwest", 26);
        room21Map.put("n", 24);
        room21Map.put("north", 24);

        room22Map.put("s", 19);
        room22Map.put("south", 19);
        room22Map.put("nw", 23);
        room22Map.put("northwest", 23);
        room22Map.put("ne", 27);
        room22Map.put("northeast", 27);

        room23Map.put("sw", 24);
        room23Map.put("southwest", 24);
        room23Map.put("se", 22);
        room23Map.put("southeast", 22);
        room23Map.put("ne", 28);
        room23Map.put("northeast", 28);

        room24Map.put("s",21);
        room24Map.put("south",21);
        room24Map.put("nw",25);
        room24Map.put("northwest",25);
        room24Map.put("ne",23);
        room24Map.put("northeast",23);

        room25Map.put("se",24);
        room25Map.put("southeast",24);

        room26Map.put("se", 21);
        room26Map.put("southeast", 21);

        room27Map.put("sw",22);
        room27Map.put("southwest",22);

        room28Map.put("sw",23);
        room28Map.put("southwest",23);
        room28Map.put("e",29);
        room28Map.put("east",29);

        room29Map.put("w", 28);
        room29Map.put("west", 28);
        room29Map.put("nw", 30);
        room29Map.put("northwest", 30);


        room30Map.put("north",0);
        room30Map.put("n",0);


        Room room0 = new Room(0, "Menu","city" ,room0Map, 1000);
        Room room1 = new Room(1, "Welcome to the Tavern, return here if you are hurt.","city",room1Map,1000);
        Room room2 = new Room(2,"You have entered the Townsquare.","city", room2Map,1000);
        Room room3 = new Room(3,"You have entered the Southeastern Lords' district.","city",room3Map,1000);
        Room room4 = new Room(4,"You have entered the Northwestern Lords' district.","city",room4Map,1000);
        Room room5 = new Room(5,"You have entered the Eastern outskirts.","city",room5Map,90);
        Room room6 = new Room(6,"You have entered the Western outskirts.","city",room6Map,90);
        Room room7 = new Room(7,"You have entered the Ruins, it seems to have been burned down in the past.","city",room7Map,1000);
        Room room8 = new Room(8,"You have reached the Entrance to the Forest.","forest",room8Map,65);
        Room room9 = new Room(9,"You have found a cliff.","forest",room9Map,50);
        Room room10 = new Room(10,"You approach a clearing in the woods.","forest",room10Map,55);
        Room room11 = new Room(11,"You are lost deep in the forest.","forest",room11Map,35);
        Room room12 = new Room(12,"You approach an entrance to the forest.","forest",room12Map,65);
        Room room13 = new Room(13,"You have found a forest clearing.","forest",room13Map,45);
        Room room14 = new Room(14,"You find a  rundown shack in the woods.","forest",room14Map,90);
        Room room15 = new Room(15,"You come across another clearing.","forest",room15Map,35);
        Room room16 = new Room(16,"The forest path seems endless.","forest",room16Map,50);
        Room room17 = new Room(17,"You come to a fork, you think you can see the end of the path.","forest",room17Map,50);
        Room room18 = new Room(18,"You almost trip over the edge of a cliff! Perhaps this isn't the best path.","forest",room18Map,80);
        Room room19 = new Room(19,"You enter the cave and hear sounds of the undead.","dungeon",room19Map,1000);
        Room room20 = new Room(20,"This tunnel seems to go on forever.","dungeon",room20Map,50);
        Room room21 = new Room(21,"You finally approach a fork in the path.","dungeon",room21Map,35);
        Room room22 = new Room(22,"You approach a fork in the tunnel.","dungeon",room22Map,80);
        Room room23 = new Room(23,"You come to an intersection leading into darkness.","dungeon",room23Map,55);
        Room room24 = new Room(24,"Yet another fork in the road.","dungeon",room24Map,40);
        Room room25 = new Room(25,"A dead end, better turn around before it becomes your end.","dungeon",room25Map,25);
        Room room26 = new Room(26,"The tunnel past here is blocked by a rockfall.","dungeon",room26Map,65);
        Room room27 = new Room(27,"You find what looks to be an old miners' rest area.","dungeon",room27Map,30);
        Room room28 = new Room(28,"You think you can see a light up ahead.","dungeon",room28Map,1000);
        Room room29 = new Room(29,"You entered the lair of a dragon!","dungeon",room29Map,0,dungeonMonster4);
        Room room30 = new Room(30,"Congratulations, you beat the dragon and saved Wolvaria!","dungeon",room30Map,1000);


        roomList.add(room0);
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room6);
        roomList.add(room7);
        roomList.add(room8);
        roomList.add(room9);
        roomList.add(room10);
        roomList.add(room11);
        roomList.add(room12);
        roomList.add(room13);
        roomList.add(room14);
        roomList.add(room15);
        roomList.add(room16);
        roomList.add(room17);
        roomList.add(room18);
        roomList.add(room19);
        roomList.add(room20);
        roomList.add(room21);
        roomList.add(room22);
        roomList.add(room23);
        roomList.add(room24);
        roomList.add(room25);
        roomList.add(room26);
        roomList.add(room27);
        roomList.add(room28);
        roomList.add(room29);
        roomList.add(room30);
        //start GUI
        launch(args);
    }
}
