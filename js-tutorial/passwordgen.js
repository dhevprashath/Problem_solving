// Random Password Generator

function generatePassword(length, uppercase, lowercase, numbers, symbols) {
    
    const upperCaseChars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    const lowerCaseChars = 'abcdefghijklmnopqrstuvwxyz';
    const numberChars = '0123456789';
    const symbolChars = '!@#$%^&*()_+[]{}|;:,.<>?';

    let allowedChars = '';
    let password = '';

    allowedChars += uppercase ? upperCaseChars : '';
    allowedChars += lowercase ? lowerCaseChars : '';
    allowedChars += numbers ? numberChars : '';
    allowedChars += symbols ? symbolChars : '';

    if (length <= 0) {
        return `password length must be greater than 0`;
    }

    if (allowedChars.length === 0) {
        return `At least one character type must be selected`;
    }

    for (let i = 0; i < length; i++) {
        const randomIndex = Math.floor(Math.random() * allowedChars.length);
        password += allowedChars[randomIndex];
    }

    return 'password: ' + password;
}

const passwordlength = 12;
const includeUppercase = true;
const includeLowercase = true;
const includeNumbers = true;
const includeSymbols = true;



const password = generatePassword(
              passwordlength,
              includeUppercase,
              includeLowercase, 
              includeNumbers,
              includeSymbols
            );
console.log(`Generated Password: ${password}`);

