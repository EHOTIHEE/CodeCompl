import { randomNumberTs } from '../untils/randomizerForTs';

//3rd case
// Write a JavaScript function named checkSyntax that takes a string, evaluates it using eval, and returns true if it's valid code or false if an error is thrown. Keep the implementation minimal — no extra logic, no comments, no explanation, just the raw function.


//4th case

// Parse the input string JavaScript object



// create a class for books with types and methods to add, remove, edit, view, sort, filter and search for them.

//5 case
class Library extends Book {
    constructor(name) {
        super();
        this.name = name;
        this.books = [];
    }
    addBook(book) {
        this.books.push(book);
    }


    
    // 5th case
    editBook(oldTitle, newTitle, newAuthor) {
        const bookIndex = this.books.findIndex((book) => book.title === oldTitle);
    }
}


//7th case
class AsyncArrowFunctions {
    constructor() {
      // Initialization if needed
    }
  
    // Example of an async arrow function for fetching data
    fetchData = async (url) => {
      try {
        const response = await fetch(url);
        return await response.json();
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };
    
    // Example of function for updating data with url and updated data as parameters
    saveData = async (data) => {
        try {
            const response = await fetch('/api/save', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(data),
            });
            return response.ok;
        } catch (error) {
            console.error('Error saving data:', error);
        }
    };
  }

  
    // Example of an async arrow function for deleting data
    deleteData = async (url) => {
      try {
        const response = await fetch(url, {
          method: 'DELETE',
        });
        return response.ok;
      } catch (error) {
        console.error('Error deleting data:', error);
      }
    };
  
    // 10th case
    updateData = async (url, newData) => {
  }
  //9th case function with while
  async function processItemWithDelay(items, delay){
    let index = 0
  }
  //11th case
  async function processItemsSequentially(items, delay){
    let index = 0
    
  }

    //12th case
    async function getBooksByType(type){
        //after filter
        return this.books.filter();
    }
    //13th case 
    function checkValue() {
        const a = "";
        if (a === "smt") {
          console.log("The variable 'a' contains:", a);
        } else {
            //14th case
          console.log("");
        }
      }

      //15th case
    class author {
        //after constructor
        constructor() {
          this.authorName = authorName;
          this.age = age;
          this.gender = gender;
          this.country = country;
          this.email = email;
        
        }
        //16th case
        isFromCountry(targetCountry) {
            
        }
        //17th case
        addNewEmail(newEmail) {
            this.email = `${1} + ${this.email}`;
        }

    
    }
    //6th буду удалять скобки и писать заново
    function checkIfElse(condition){}

