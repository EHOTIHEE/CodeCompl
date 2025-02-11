import { randomNumber } from '../utils/randomizerForTs';

// 3rd case
// generate function to check syntax of the string



// 4th case
// Parse the input string into a TypeScript object

// create a class for books with types and methods to add, remove, edit, view, sort, filter and search for them.


class Book {
    title: string;
    author: string;
    genre?: string;
    year?: number;


    // 2nd case
    constructor(title: string, author: string, genre?: string, year?: number) {   
    }
}

// 5th case
class Library extends Book {
    name: string;
    books: Book[];

    constructor(name: string) {
        super('', '');
        this.name = name;
        this.books = [];
    }
    addBook(book: Book) {
        this.books.push(book);
    }

    // 5th case
    editBook(oldTitle: string, newTitle: string, newAuthor: string) {
        const bookIndex = this.books.findIndex((book) => book.title === oldTitle);
    }
}

// 7th case
class AsyncArrowFunctions {
    constructor() {
    }

    // Example of an async arrow function for fetching data
    fetchData = async (url: string): Promise<any> => {
        try {
            const response = await fetch(url);
            return await response.json();
        } catch (error) {
            console.error('Error fetching data:', error);
        }
    };

    // Example of function for updating data with url and updated data as parameters
    saveData = async (data: any): Promise<boolean | undefined> => {
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

    // Example of an async arrow function for deleting data
    deleteData = async (url: string): Promise<boolean | undefined> => {
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
    updateData = async (url: string, newData: any): Promise<void> => {
    };
}

// 9th case
async function processItemWithDelay(items: any[], delay: number) {
    let index = 0;

}

// 11th case
async function processItemsSequentially(items: any[], delay: number) {
    let index = 0;
}

// еще один кейс внутри фильтра
async function getBooksByType(this : {books : Book[]} , type:string){
    return this.books.filter();
}

// 13th case
function checkValue(): void {
    const a: string = '';
    if (a === 'smt') {
        console.log("The variable 'a' contains:", a);
    } else {
        // 14th case
        console.log('');
    }
}
//15th case
//2nd
class Author {

    constructor() {
        this.authorName = authorName;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.email = email;
    }

    // 16th case
    isFromCountry(targetCountry: string): boolean {
        return this.country === targetCountry;
    }

    // 17th case
    addNewEmail(newEmail: string): void {
        this.email = `${1} + ${this.email}`;
    }
}

// 6th буду удалять скобки и писать заново
function checkIfElse(condition: boolean) {}



function getUniqueNumbers (...numbers: number[]){
    return [...new Set(numbers)];
}

function processNumbers (  ): void {
    numbers.forEach((num, index) => console.log(`Число ${num} на позиции ${index}`));
  }
  