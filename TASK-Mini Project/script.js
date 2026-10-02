const tableBody = document.getElementById("tableBody");
const pagination = document.getElementById("pagination");

let users = [];
let currentPage = 1;

const rowsPerPage = 5;


// Fetch data
async function getUsers() {

    try {

        const response = await fetch(
            "https://jsonplaceholder.typicode.com/users"
        );

        users = await response.json();

        displayUsers(currentPage);
        createPagination();

    } catch (error) {

        console.log("Error fetching data:", error);

        tableBody.innerHTML = `
            <tr>
                <td colspan="4">Unable to load data</td>
            </tr>
        `;
    }
}


// Display users for current page
function displayUsers(page) {

    tableBody.innerHTML = "";

    const startIndex = (page - 1) * rowsPerPage;
    const endIndex = startIndex + rowsPerPage;

    const pageUsers = users.slice(startIndex, endIndex);

    pageUsers.forEach(function(user) {

        const row = document.createElement("tr");

        const idCell = document.createElement("td");
        idCell.textContent = user.id;

        const nameCell = document.createElement("td");
        nameCell.textContent = user.name;

        const usernameCell = document.createElement("td");
        usernameCell.textContent = user.username;

        const emailCell = document.createElement("td");
        emailCell.textContent = user.email;

        row.appendChild(idCell);
        row.appendChild(nameCell);
        row.appendChild(usernameCell);
        row.appendChild(emailCell);

        tableBody.appendChild(row);
    });
}


// Create pagination buttons
function createPagination() {

    pagination.innerHTML = "";

    const totalPages = Math.ceil(users.length / rowsPerPage);


    // Previous button
    const previousButton = document.createElement("button");

    previousButton.textContent = "Previous";

    previousButton.disabled = currentPage === 1;

    previousButton.addEventListener("click", function() {

        if (currentPage > 1) {

            currentPage--;

            displayUsers(currentPage);
            createPagination();
        }
    });

    pagination.appendChild(previousButton);


    // Page number buttons
    for (let i = 1; i <= totalPages; i++) {

        const pageButton = document.createElement("button");

        pageButton.textContent = i;

        if (i === currentPage) {
            pageButton.classList.add("active");
        }

        pageButton.addEventListener("click", function() {

            currentPage = i;

            displayUsers(currentPage);
            createPagination();
        });

        pagination.appendChild(pageButton);
    }


    // Next button
    const nextButton = document.createElement("button");

    nextButton.textContent = "Next";

    nextButton.disabled = currentPage === totalPages;

    nextButton.addEventListener("click", function() {

        if (currentPage < totalPages) {

            currentPage++;

            displayUsers(currentPage);
            createPagination();
        }
    });

    pagination.appendChild(nextButton);
}


// Start application
getUsers();