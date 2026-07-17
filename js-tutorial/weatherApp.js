// Weather App

const weatherForm = document.querySelector(".weatherForm");
const cityInput = document.querySelector(".cityInput");
const card = document.querySelector(".card");

const apiKey = "YOUR_API_KEY"; // Replace with your OpenWeather API key

weatherForm.addEventListener("submit", async (event) => {
    event.preventDefault();

    const city = cityInput.value.trim();

    if (city) {
        try {
            const weatherData = await getWeatherData(city);
            displayWeatherInfo(weatherData);
        } catch (error) {
            console.error(error);
            displayError(error.message);
        }
    } else {
        displayError("Please enter a city.");
    }
});

async function getWeatherData(city) {

    const apiUrl = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`;

    const response = await fetch(apiUrl);

    if (!response.ok) {
        throw new Error("Could not find weather data.");
    }

    return await response.json();
}

function displayWeatherInfo(data) {

    console.log(data);

    card.textContent = "";
    card.style.display = "flex";

    const cityDisplay = document.createElement("h1");
    cityDisplay.textContent = data.name;

    const tempDisplay = document.createElement("p");
    tempDisplay.textContent = `${data.main.temp} °C`;

    const humidityDisplay = document.createElement("p");
    humidityDisplay.textContent = `Humidity: ${data.main.humidity}%`;

    const descDisplay = document.createElement("p");
    descDisplay.textContent = data.weather[0].description;

    const emojiDisplay = document.createElement("p");
    emojiDisplay.textContent = getWeatherEmoji(data.weather[0].id);

    card.appendChild(cityDisplay);
    card.appendChild(tempDisplay);
    card.appendChild(humidityDisplay);
    card.appendChild(descDisplay);
    card.appendChild(emojiDisplay);
}

function getWeatherEmoji(weatherId) {

    if (weatherId >= 200 && weatherId < 300) {
        return "⛈️";
    } else if (weatherId >= 300 && weatherId < 500) {
        return "🌦️";
    } else if (weatherId >= 500 && weatherId < 600) {
        return "🌧️";
    } else if (weatherId >= 600 && weatherId < 700) {
        return "❄️";
    } else if (weatherId >= 700 && weatherId < 800) {
        return "🌫️";
    } else if (weatherId === 800) {
        return "☀️";
    } else if (weatherId > 800) {
        return "☁️";
    } else {
        return "🌍";
    }
}

function displayError(message) {

    card.textContent = "";
    card.style.display = "flex";

    const errorDisplay = document.createElement("p");
    errorDisplay.textContent = message;
    errorDisplay.classList.add("errorDisplay");

    card.appendChild(errorDisplay);
}