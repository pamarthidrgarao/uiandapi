import {BaseResponse} from './base-response'
import {User} from './user'

export class UserResponse extends BaseResponse{
     user:User;
	 users:Array<User>;
}