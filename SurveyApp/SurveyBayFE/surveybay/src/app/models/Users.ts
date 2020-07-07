import { Role } from './Role';

export class User {

    public id : number;
    public username : string;
    public password : string;
    public email : string;
    public role : Role;

    constructor(input_user_id : number, 
                input_username : string, 
                input_password : string, 
                input_email : string, 
                input_role : Role) {
                    

        this.id = input_user_id;
        this.username = input_username;
        this.password = input_password;
        this.email = input_email;
        this.role = input_role;
    }
}