import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ext'
})
export class ExtPipe implements PipeTransform {

  transform(value: String, a: number, s : String): String {
    if (value.length < a - s.length){
      return value
    }else {
      return value.substr(0,a - s.length) + s;
    }

  }

}
